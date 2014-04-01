package s2g.ast.exp

import s2g.ast.binaryoperator.BinaryOperator
import s2g.eval.{Context, PartialSolution}
import s2g.ast.value.ValueLiteral

case class EBinaryOp(left: Exp, right: Exp, op: BinaryOperator) extends Exp {
  override def evaluate(context: Context): ValueLiteral = op(left.evaluate(context), right.evaluate(context))

  override def tryToEvaluate(context: Context): Exp = EBinaryOp(left.tryToEvaluate(context), right.tryToEvaluate(context), op)

  override def getFreeVariables: Seq[String] = left.getFreeVariables ++ right.getFreeVariables
}