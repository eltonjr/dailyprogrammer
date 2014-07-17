object ws1 {
  def hextodraw(input: String) = {
    (input split " ") .map { s =>
      Integer.toBinaryString(Integer.parseInt(s, 16))
    } .map { line => fillWithZeros(line).map { c => c match {
          case ' ' => 'A'
          case '1' => 'X'
          case '0' => ' '
        }
      }
    } .reduce { (acc, n) => acc + "\n" + n }
  }

  def fillWithZeros(input: String) : String = {
    if (input.length() >= 8) input else fillWithZeros("0" ++ input)
  }

  println(hextodraw("18 3C 7E 7E 18 18 18 18"))
}
