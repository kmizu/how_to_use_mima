package com.github.kmizu.how_to_use_mima

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Buffer

class ReturnTypeInferenceInPublishedMethod() {
  def makeBuffer[T]: Buffer[T] = ArrayBuffer[T]()
}
