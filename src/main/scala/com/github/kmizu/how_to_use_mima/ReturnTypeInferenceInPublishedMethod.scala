package com.github.kmizu.how_to_use_mima

import scala.collection.mutable.ArrayBuffer

class ReturnTypeInferenceInPublishedMethod() {
  def makeBuffer[T] = ArrayBuffer[T]()
}
