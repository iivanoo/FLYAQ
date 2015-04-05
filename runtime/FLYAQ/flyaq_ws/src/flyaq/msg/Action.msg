string name
int8 DEVICE = 0
int8 FEEDBACK = 1

int8 CHECK = 2

int8 UNICAST_NOTIFY = 3

int8 MULTICAST_NOTIFY = 4

int8 BROADCAST_NOTIFY = 5

int8 type # enumerate above

string action_name # filled only in case of DeviceAction and Feedback

Parameter[] parameters # filled only in case of DeviceAction and Feedback

string slot_name # filled only in case of Notify (any kind) or CheckNotification

string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify

