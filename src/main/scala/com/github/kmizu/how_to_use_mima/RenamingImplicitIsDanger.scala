package com.github.kmizu.how_to_use_mima

class RenamingImplicitIsDanger() {
  implicit def IntToString(v: Int): String = v.toString
}
