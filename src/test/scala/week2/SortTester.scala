package week2

import chisel3.iotesters.PeekPokeTester

class Sort4Tester(c: Sort4) extends PeekPokeTester(c) {

  println("The first test start!")
  poke(c.io.in0, 3)
  poke(c.io.in1, 6)
  poke(c.io.in2, 9)
  poke(c.io.in3, 12)
  expect(c.io.out0, 3)
  expect(c.io.out1, 6)
  expect(c.io.out2, 9)
  expect(c.io.out3, 12)

  println("The Second test start!")
  poke(c.io.in0, 13)
  poke(c.io.in1, 4)
  poke(c.io.in2, 6)
  poke(c.io.in3, 1)
  expect(c.io.out0, 1)
  expect(c.io.out1, 4)
  expect(c.io.out2, 6)
  expect(c.io.out3, 13)

  println("The third test start!")
  poke(c.io.in0, 13)
  poke(c.io.in1, 6)
  poke(c.io.in2, 4)
  poke(c.io.in3, 1)
  expect(c.io.out0, 1)
  expect(c.io.out1, 4)
  expect(c.io.out2, 6)
  expect(c.io.out3, 13)

}