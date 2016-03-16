package com.github.kmizu.how_to_use_mima

import scala.collection.mutable.ListBuffer

class ReturnTypeInferenceInProtectedMethod {
  protected def makeBuffer[T] = ListBuffer[T]()
}
