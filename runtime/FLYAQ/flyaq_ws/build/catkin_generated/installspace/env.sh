#!/usr/bin/env sh
# generated from catkin/cmake/templates/env.sh.in

if [ $# -eq 0 ] ; then
  /bin/echo "Entering environment at '/home/viki/Desktop/FLYAQ/flyaq_ws/install', type 'exit' to leave"
  . "/home/viki/Desktop/FLYAQ/flyaq_ws/install/setup.sh"
  "$SHELL" -i
  /bin/echo "Exiting environment at '/home/viki/Desktop/FLYAQ/flyaq_ws/install'"
else
  . "/home/viki/Desktop/FLYAQ/flyaq_ws/install/setup.sh"
  exec "$@"
fi
