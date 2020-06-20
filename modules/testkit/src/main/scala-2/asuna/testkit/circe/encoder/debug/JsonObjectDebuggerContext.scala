package zsg.testkit.circe.encoder.debug

import zsg.{Context4, Plus4, ZsgTuple0}

object JsonObjectDebuggerContext extends Context4[JsonObjectDebugger] {
  override def append[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4](x: JsonObjectDebugger[X1, X2, X3, X4], y: JsonObjectDebugger[Y1, Y2, Y3, Y4])(
    p: Plus4[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4]
  ): JsonObjectDebugger[Z1, Z2, Z3, Z4] = new JsonObjectDebugger[Z1, Z2, Z3, Z4](p.plus4(x.target, y.target))

  override def start: JsonObjectDebugger[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] = new JsonObjectDebugger[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0](ZsgTuple0.value)
}
