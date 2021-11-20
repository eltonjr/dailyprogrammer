fun lettersum(word: String) = if (word.isEmpty()) 0 else word.map { it.toInt() -96 }.reduce { a, b -> a+b }

lettersum("")
lettersum("a")
lettersum("z")
lettersum("cab")
lettersum("excellent")
lettersum("microspectrophotometries")