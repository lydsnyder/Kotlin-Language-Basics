fun main(args: Array<String>) {
    println("Hello, world!")
    
    val sample1 = 0x3A
    var sample2 = 58
    var heartRate = 85
    var deposits = 135002796
    val acceleration = 9.800F
    var mass = 14.6F
    var distance = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral = "{222B}"
    var name = "Karen"
    
    if(sample1 == sample2){
        println("The samples are equal.")
    }else {
        println("The samples are not equal.")
    }
    
    if(heartRate >= 40 && heartRate <= 80){
        println("Heart rate is normal.")
    }else {
        println("Heart rate is not normal.")
    }
    
    if(deposits >= 100000000 ){
        println("You are exceedingly wealthy.")
    }else {
        println("Sorry you are so poor.")
    }

    var force: Float = (mass * acceleration)
    
    println("force = $force")
    
    println("$distance is the distance.")

    if( lost == true ){
        if(expensive == true)
            println("I am really sorry! I will get the manager.")
        else
            println("Here is coupon for 10% off.")
    }
    
    when (choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }
    
    println("$integral is an integral")
    
    for( i in 5..10)
    {
        println("i = $i")
    }
    
    var age = 0
    
    while( age < 6 )
    {
        println("age is $age")
        age++
    }
    
    println("Hello, $name!")
}