# Consistent Hashing

---


## Hashing
A hash function maps a key to specific node. In a distributed system, a hash function is used to get the server/node info with a key. 
This works perfectly well, for a system with defined set of nodes/ servers. Usually, this is done by the load balancers.

The problem is with increase of requests and if at all a new server needs to be added, without disturbing all requests. 

i.e. A load balancer which can handle dynamic distributed system.

how to design the load balancer?  

--- 

## Consistent Hashing

A technique used to efficiently distribute and balance data across multiple servers/nodes. Also, when the number of nodes change, this minimises the amount of data movement. 




