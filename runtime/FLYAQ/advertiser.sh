#!/bin/bash

# assuming that the FLYAQ environment variable is pointing to flyaq_ws
source $FLYAQ/devel/setup.bash 

# launch the FLYAQ advertiser which is capable of advertising all the static ROS topics needed by the platoform (server-side)
rosrun flyaq advertiser