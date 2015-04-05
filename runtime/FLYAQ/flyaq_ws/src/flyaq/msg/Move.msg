string name
int8 START = 0
int8 STOP = 1
int8 TAKE_OFF = 2
int8 LAND = 3
int8 GO_TO = 4
int8 HOVER = 5
int8 CIRCLE = 6
int8 HEAD_TO = 7
int8 type # enumerate above
Action[] pre_actions
Action[] post_actions
float32 altitude # filled only in case of TakeOff move
Coordinate target_position # filled only in case of GoTo or Circle moves
int8 DIRECT = 0
int8 HORIZONTAL_FIRST = 1
int8 VERTICAL_FIRST = 2
int8 strategy # enumerated above, filled only in case of GoTo move
duration duration # filled only in case of Hover or Circle moves
float32 radius # filled only in case of Circle move
float32 circle_altitude # filled only in case of Circle move
bool clockwise # filled only in case of Circle move
float32 direction # filled only in case of HeadTo move 
