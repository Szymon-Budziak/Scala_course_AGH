// 1st example
// package p1.p2.p3
// class A3

// 2nd example
// package p1
// package p2
// package p3
// class A3

// 3rd example
// package p1.p2.p3 {
//    class A3
// }

// 4rd example
// package p1{
//     package p2 {
//         package p3 {
//             class A3
//         }
//     }
// }

// 5th example
// package p1 {
//   class A1T { new A1B }
//   package p2 {
//     class A2T { new A2B; new A1T; new A1B }
//     package p3 {
//       class A3 { new A2T; /* new A2B; */ new A1T; /* new A1B */ }
//     }
//     class A2B { /* new A2T; new A1T; new A1B */ }
//   }
//   class A1B { new A1T }
// }

// object Appl {
//   def main(args: Array[String]) {
//     new p1.A1T
//     new p1.A1B
//     new p1.p2.A2T
//     new p1.p2.A2B
//     new p1.p2.p3.A3
//   }
// }

// 6th example
// package p1 {
//     class A1
//     package p2 {
//         class A21
//     }
// }

// package p1 {
//   package p2 {
//     class A22 { new A1 }
//   }
// }

// 7th example
package p1 {
  package p2 {
    class A1 { println("p1.p2.A1") }
    class A22 {
      println("Calling new p1.p2.A1") 
      new A1
      println("Calling new _root_.p1.A1")
      new _root_.p1.A1
      println("p1.p2.A22")
    }
  }
}

object Appl {
  def main(args: Array[String]) {
    new p1.A1
    new p1.p2.A21
    new p1.p2.A22
  }
}