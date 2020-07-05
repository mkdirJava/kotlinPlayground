package GettingStarted/*
val is const and final
var is mutable
both are non nullable
 */

val immutableVariable = "Did you get to the location?"
var mutableVariable = "Where?"
mutableVariable = "Oh, yeah I did, no one was at the party"

println(""" The question was 
    |${immutableVariable}
    |The answer is 
    |${mutableVariable.replace("no one", "everyone")}
""".trimMargin())

/*
tertariy statements are a little different
and like in VB there is steps
 */
for(count in 1..100 step 3){
    if (count % 2 === 0) println("""The count is even at ${count}""") else println("""The count is odd at ${count}""")
}

for(count in 100 downTo 0    step 3){
    if (count % 2 === 0) println("""The count is even at ${count}""") else println("""The count is odd at ${count}""")
}

/*
There are also nullable types like in TYPESCRIPT!
 */

var nullableString: String? = null

fun printNullableString()= if(nullableString === null) println("nullableString is null")else println(nullableString)

printNullableString()
nullableString= "NOT A NULL"
printNullableString()

/*
There is smart casting
 */

val items = listOf("String", 1 )

fun printItems(items: List<Any>){
    for(item in items){
        when(item) {
            item is String -> println("""Item is a string ${item}""")
            else -> println("""Item is not a string ${item}, it is ${item::class}""")
        }
    }
}
printItems(items)

/*
basic collections, looks like this has a newish skin
 */

var list = listOf("home","work", 90,2,3,5, "pub")
var filterdNumbersAsString = list.
    filter { it is Number }
    .map { it.toString() }

filterdNumbersAsString.forEach{ println(it)}

/*
There is no new keyword in kotlin
 */

data class Bottle (val message:String)

var messageInABottle = Bottle("home")
println(messageInABottle)