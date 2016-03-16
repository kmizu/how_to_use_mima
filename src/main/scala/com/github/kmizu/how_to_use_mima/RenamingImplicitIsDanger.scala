package com.github.kmizu.how_to_use_mima

class RenamingImplicitIsDanger() {
  implicit def intToString(v: Int): String = v.toString
}
