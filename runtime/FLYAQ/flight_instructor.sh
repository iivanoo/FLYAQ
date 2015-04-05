#!/bin/bash 

# assuming that the FLYAQ environment variable is pointing to flyaq_ws
source $FLYAQ/devel/setup.bash

# launch the Flight Instructor component.
# it will expect the Rosbridge server running and listening in the provided host and port
# syntax: java -jar FlightInstructor.jar <HOST> <PORT>
java -jar FlightInstructor.jar localhost 9090