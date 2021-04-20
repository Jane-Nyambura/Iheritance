fun main() {
    var noah=Car("ESE","tesla","red",8)
    noah.carry(15)
    noah.identity()
    println(noah.calculateParkingFee(20))
    var bus=Bus("subaru","legacy","blue",20);
    println(bus.maxTripFare(100.8))
    println(bus.calculateParkingFee(200))
}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
fun carry(people: Int) {
    var x = people - capacity;
    if (people <= capacity) {
        println("carrying $people passengers")
    } else {
        println("over capacity by $x people")
    }
}
fun identity(){
    println("My dream  car is a color $color ,$model ,$make")
}
    open fun calculateParkingFee(hours:Int):Int {
        return hours * 20
    }
}
    class Bus ( make:String, model:String, color:String,capacity:Int):Car(make,model,color,capacity){
fun maxTripFare(fare:Double):Double{
    return capacity*fare
}

        override fun calculateParkingFee(hours: Int): Int{
            return (hours * capacity)

    }
}
