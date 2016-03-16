package com.github.kmizu.how_to_use_mima

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Buffer

class ReturnTypeInferenceInProtectedMethod {
  protected def makeBuffer[T]: Buffer[T] = ListBuffer[T]()
}
