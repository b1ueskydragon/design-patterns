package graffiti

sealed abstract class Tree

case class Branch(left: Tree, right: Tree) extends Tree

case class Node(elem: Int) extends Tree
