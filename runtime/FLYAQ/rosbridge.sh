#!/bin/bash

# assuming that the FLYAQ environment variable is pointing to flyaq_ws
source $FLYAQ/devel/setup.bash 

# launch the Rosbridge main server
roslaunch rosbridge_server rosbridge_websocket.launch 