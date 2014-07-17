object Main {

	def main(args :Array[String]){
		printHex("18 3C 7E 7E 18 18 18 18")

		invertHex("18 3C 7E 7E 18 18 18 18")

		zoomHex("18 3C 7E 7E 18 18 18 18")

		rotateHex("18 3C 7E 7E 18 18 18 18")
	}

	def printHex(input: String) = {
		hexlineToBinary(input) .map { line => line.map { c => c match {
					case '1' => 'X'
					case '0' => ' '
				}
			}
		} .foreach(println)
	}

	def invertHex(input: String) = {
		hexlineToBinary(input) .map { line => line.map { c => c match {
					case '1' => ' '
					case '0' => 'X'
				}
			}
		} .foreach(println)
	}

	def zoomHex(input :String) = {
		hexlineToBinary(input) .map { line => List(line, line) } .flatten
			.map { nline => nline.map { c => c match {
				case '1' => "XX"
				case '0' => "  "
			}
		 } .foldLeft("")( (a, b) => a + b)
		} .foreach(println)
	}

	def rotateHex(input :String) = {
		for(i <- 0 to 7){
			println(concatString(i, 0, "", hexlineToBinary(input)).map { c => c match {
					case '1' => 'X'
					case '0' => ' '
				}
			})
		}
	}

	def concatString(line :Int, index :Int, acc :String, binaries :Array[String]) :String = {
		if(index == 8) acc
		else concatString(line, index + 1, acc + binaries(index).charAt(line), binaries)
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
