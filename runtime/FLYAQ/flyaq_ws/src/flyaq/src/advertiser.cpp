#include "ros/ros.h"
#include "std_msgs/String.h"
#include "flyaq/Behaviour.h"
#include "flyaq/Command.h"
#include "flyaq/CommandReturn.h"
// #include "TOCHECK/image_raw"
#include "flyaq/Feedback.h"
#include <sstream>

int main(int argc, char **argv)
{

  ros::init(argc, argv, "advertiser");

  ros::NodeHandle n;
  ROS_INFO("%s", "Advertising the following topics:");
  ros::Publisher parameter_pub = n.advertise<flyaq::Behaviour>("behaviour", 1000);
  ROS_INFO("%s", "/behaviour");
  ros::Publisher parameter_pub2 = n.advertise<flyaq::Command>("command", 1000);
  ROS_INFO("%s", "/command");
  ros::Publisher parameter_pub3 = n.advertise<flyaq::CommandReturn>("command_return", 1000);
  ROS_INFO("%s", "/command_return");
  
  // controllare con Roberto e Alessandra
  // ros::Publisher parameter_pub5 = n.advertise<flyaq::Feedback>("feedback", 1000);
  // ros::Publisher parameter_pub6 = n.advertise<image::raw>("image", 1000);
  
  ros::spin();

  return 0;
}