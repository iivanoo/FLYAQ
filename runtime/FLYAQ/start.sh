 #!/bin/bash         

# launch the RosBridge server 
gnome-terminal -x ./rosbridge.sh &
sleep 2

#gnome-terminal -x ./mjpeg_server.sh &
#sleep 10
#gnome-terminal -x ./feedback.sh &
#sleep 5
#gnome-terminal -x ./image_raw.sh &
#sleep 5

#launch the FLYAQ advertiser component to setup all the needed topics
gnome-terminal -x ./advertiser.sh &
sleep 2

#launch the FLYAQ Flight Instructor component
#gnome-terminal -x ./flight_instructor.sh