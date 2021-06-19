package zsg
abstract class Application[F[_ <: TypeHList], T <: Context[F], Boot, Target <: TypeHList] {
  def application(context: T): F[Target]
}
object Application {
  implicit def applicationImplicit[F[_ <: TypeHList], T <: Context[F], Boot, Target <: TypeHList](implicit
    i: F[Target]
  ): Application[F, T, Boot, Target] =
    new Application[F, T, Boot, Target] {
      def application(context: T): F[Target] = i
    }
  implicit def applicationImplicit2[F[_ <: TypeHList], T <: Context[F], Boot1, Boot2, Target1 <: TypeHList, Target2 <: TypeHList](implicit
    i1: Application[F, T, Boot1, Target1],
    i2: Application[F, T, Boot2, Target2]
  ): Application[F, T, ItemTag2[Boot1, Boot2], Item2TypeHList[Target1, Target2]] =
    new Application[F, T, ItemTag2[Boot1, Boot2], Item2TypeHList[Target1, Target2]] {
      def application(context: T): F[Item2TypeHList[Target1, Target2]] =
        context.append(i1.application(context), i2.application(context))(Plus.item2Plus)
    }
}
