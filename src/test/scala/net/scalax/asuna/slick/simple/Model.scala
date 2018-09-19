package net.scalax.asuna.slick.simple

import io.circe.JsonObject
import net.scalax.asuna.helper.RootTable
import net.scalax.asuna.slick.umr.UmrHelper
import net.scalax.asuna.slick.umr.rmu.RmuWriterQuery
import slick.jdbc.H2Profile.api._

case class InnerFriends2(id: Long, name: String, nick: String, age: Int, mark: List[InnerMark])
case class InnerMark(id: Long, name: String, mark: Int)
case class InnerFriendInput(mark: List[InnerMark])
case class InnerFriendOutput(id: Long)

case class Friends5(id: Long, name123: String, nick: String, age: Int)

class FriendTable3Model(friend: FriendTable2) extends UmrHelper {

  val id      = rep(friend.id)
  val name123 = rep(friend.name)

  val nick = rep(friend.nick)
  val age  = rep(friend.age)

  lazy val shape: umr.ShapeValue[Friends5] = umr.modelOnly[Friends5](this).compile

  lazy val reader = umr.effect(shape).toSv

}

case class Friends6(id: Long, nick: String)
case class Friends7(age: Int, id: Long)

class FriendTable4Model(cons: Tag) extends FriendTable2(cons) with UmrHelper {

  lazy val shape6: umr.ShapeValue[Friends6] = umr.modelOnly[Friends6](this).compile
  lazy val reader6                          = umr.effect(shape6).toSv

  lazy val shape7: umr.ShapeValue[Friends7] = umr.modelOnly[Friends7](this).compile
  lazy val reader7                          = umr.effect(shape7).toSv

}

class dfjgoshjiotherihte(cons: FriendTable4Model) extends UmrHelper {
  @RootTable val otherTable = cons
  lazy val reader1111       = umr.effect(umr.modelOnly[Friends6](this).compile).toSv
}

object FriendTable4Model extends TableQuery(cons => new FriendTable4Model(cons))

case class DynFields(id: Long, name: String, age: Int)
case class Friends8(age: Int, dyn: JsonObject)

class DynFriendModel(cons: Tag, cols: List[String]) extends FriendTable2(cons) with UmrHelper with RmuWriterQuery {
  self =>

  def dyn                              = rmu.effect(rmu.modelOnly[DynFields](self).compile).withCols(cols)
  def shape8: umr.ShapeValue[Friends8] = umr.modelOnly[Friends8](self).compile
  def reader8                          = umr.effect(shape8).toSv

}

object DynFriendModelTq extends (List[String] => TableQuery[DynFriendModel]) {
  override def apply(v1: List[String]): TableQuery[DynFriendModel] = {
    TableQuery(cons => new DynFriendModel(cons, v1))
  }
}

class FriendTable2Model(friend: FriendTable2) extends UmrHelper {
  self =>

  val id   = rep(friend.id)
  val name = rep(friend.name)
  val nick = rep(friend.nick)
  val age  = rep(friend.age)

  lazy val shape: umr.LazyDataShapeValue[InnerFriendInput, InnerFriends2, InnerFriendOutput] =
    umr.lazyData[InnerFriendInput, InnerFriends2, InnerFriendOutput](self).compile
  lazy val reader = umr.effect(shape).toSv

}

class MarkTableModel(markTable: MarkTable) extends UmrHelper {

  val id   = rep(markTable.id)
  val name = rep(markTable.name)
  val mark = rep(markTable.mark)

  lazy val shape: umr.ShapeValue[InnerMark] = umr.modelOnly[InnerMark](this).compile
  lazy val reader                           = umr.effect(shape).toSv

}
