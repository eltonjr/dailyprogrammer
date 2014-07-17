object Main {

	def main(args :Array[String]){
		printHex("18 3C 7E 7E 18 18 18 18")
	}

	def printHex(input: String) = {
		hexlineToBinary(input) .map { line => line.map { c => c match {
					case '1' => 'X'
					case '0' => ' '
				}
			}
		} .foreach(println)
	}

	def hexlineToBinary(input: String) = {
		(input split " ") .map { s =>
			Integer.toBinaryString(Integer.parseInt(s, 16))
		} .map { line => fillWithZeros(line) }
	}

	def fillWithZeros(input: String) : String = {
		if (input.length() >= 8) input else fillWithZeros("0" ++ input)
	}

}
