# Car Rental  System - Code


```kotlin
import java.util.*
import kotlin.collections.HashMap

class ParkingLot(
    val regNo: String,
    val name: String,
    val address: Address,
    val parkingTickets: HashMap<Int, ParkingTicket>,
    private val parkingSpots: List<ParkingSpot>,
    val entrance: HashMap<Int, Entrance>,
    val exit: HashMap<Int, Exit>,
    val displayBoards: HashMap<Int, DisplayBoard>,
) {
    private var parkingTicketCounter = 0
    fun getParkingTickets(vehicle: Vehicle): ParkingTicket {
        val isFull = when (vehicle) {
            is Car -> isFull(CompactSpot())
            is Van -> isFull(HandicappedSpot())
            is Truck -> isFull(LargeSpot())
            is MotorCycle -> isFull(MotorcycleSpot())
            else -> {
                false
            }
        }

        val parkingTicket = ParkingTicket(
            ticketNo = parkingTicketCounter++,
            timestamp = Date(),
            amount = 0.0,
            payment = null
        )
        vehicle.assignTicket(parkingTicket)
        parkingSpots.find { it.isFree() }?.markAllocated()
        return parkingTicket

    }

    fun addEntrance(entrance: Entrance) {

    }

    fun addExit(exit: Exit) {

    }

    fun isFull(parkingSpot: ParkingSpot): Boolean {
        return parkingSpots.find { it.isFree() } != null
    }
}

class Entrance
class Exit
class DisplayBoard
abstract class ParkingSpot {
    protected var id: Int = 0
    protected var free: Boolean = false
    protected var vehicle: Vehicle? = null
    abstract fun isFree(): Boolean
    abstract fun markAllocated()
}

class LargeSpot : ParkingSpot() {
    override fun isFree(): Boolean {
        TODO("Not yet implemented")
    }

    override fun markAllocated() {
        TODO("Not yet implemented")
    }

}

class HandicappedSpot : ParkingSpot() {
    override fun isFree(): Boolean {
        TODO("Not yet implemented")
    }

    override fun markAllocated() {
        TODO("Not yet implemented")
    }

}

class CompactSpot : ParkingSpot() {
    override fun isFree(): Boolean {
        TODO("Not yet implemented")
    }

    override fun markAllocated() {
        TODO("Not yet implemented")
    }
}

class MotorcycleSpot : ParkingSpot() {
    override fun isFree(): Boolean {
        TODO("Not yet implemented")
    }

    override fun markAllocated() {
        TODO("Not yet implemented")
    }
}

abstract class Vehicle {
    val regNo: String = ""
    abstract fun assignTicket(parkingTicket: ParkingTicket)
}

class Car : Vehicle() {
    override fun assignTicket(parkingTicket: ParkingTicket) {
        TODO("Not yet implemented")
    }
}

class Van : Vehicle() {
    override fun assignTicket(parkingTicket: ParkingTicket) {
        TODO("Not yet implemented")
    }
}

class Truck : Vehicle() {
    override fun assignTicket(parkingTicket: ParkingTicket) {
        TODO("Not yet implemented")
    }
}

class MotorCycle : Vehicle() {
    override fun assignTicket(parkingTicket: ParkingTicket) {
        TODO("Not yet implemented")
    }
}

class ParkingTicket(
    val ticketNo: Int,
    val timestamp: Date,
    var amount: Double,
    var payment: Payment?
) {
    fun calculateAmount(): Double {
        TODO("Not yet implemented")
    }
}

abstract class Payment {

}

class Address(
    val address: String,
    val pinCode: Int,
    val city: String,
    val state: String,
    val country: String
)

abstract class Account {
    protected var userName: String = ""
    protected var password: String = ""
    protected abstract fun resetPassword()
}

class Admin : Account() {
    override fun resetPassword() {

    }
}

class ParkingAgent : Account() {
    override fun resetPassword() {

    }
}
```