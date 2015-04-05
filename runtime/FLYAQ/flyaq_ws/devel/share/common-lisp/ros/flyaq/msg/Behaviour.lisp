; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude Behaviour.msg.html

(cl:defclass <Behaviour> (roslisp-msg-protocol:ros-message)
  ((name
    :reader name
    :initarg :name
    :type cl:string
    :initform "")
   (crs
    :reader crs
    :initarg :crs
    :type cl:string
    :initform "")
   (drones
    :reader drones
    :initarg :drones
    :type (cl:vector flyaq-msg:Drone)
   :initform (cl:make-array 0 :element-type 'flyaq-msg:Drone :initial-element (cl:make-instance 'flyaq-msg:Drone))))
)

(cl:defclass Behaviour (<Behaviour>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <Behaviour>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'Behaviour)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<Behaviour> is deprecated: use flyaq-msg:Behaviour instead.")))

(cl:ensure-generic-function 'name-val :lambda-list '(m))
(cl:defmethod name-val ((m <Behaviour>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:name-val is deprecated.  Use flyaq-msg:name instead.")
  (name m))

(cl:ensure-generic-function 'crs-val :lambda-list '(m))
(cl:defmethod crs-val ((m <Behaviour>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:crs-val is deprecated.  Use flyaq-msg:crs instead.")
  (crs m))

(cl:ensure-generic-function 'drones-val :lambda-list '(m))
(cl:defmethod drones-val ((m <Behaviour>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:drones-val is deprecated.  Use flyaq-msg:drones instead.")
  (drones m))
(cl:defmethod roslisp-msg-protocol:serialize ((msg <Behaviour>) ostream)
  "Serializes a message object of type '<Behaviour>"
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'name))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'crs))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'crs))
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'drones))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (roslisp-msg-protocol:serialize ele ostream))
   (cl:slot-value msg 'drones))
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <Behaviour>) istream)
  "Deserializes a message object of type '<Behaviour>"
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'crs) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'crs) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'drones) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'drones)))
    (cl:dotimes (i __ros_arr_len)
    (cl:setf (cl:aref vals i) (cl:make-instance 'flyaq-msg:Drone))
  (roslisp-msg-protocol:deserialize (cl:aref vals i) istream))))
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<Behaviour>)))
  "Returns string type for a message object of type '<Behaviour>"
  "flyaq/Behaviour")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'Behaviour)))
  "Returns string type for a message object of type 'Behaviour"
  "flyaq/Behaviour")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<Behaviour>)))
  "Returns md5sum for a message object of type '<Behaviour>"
  "9b9d03cec42c32ed5c6a48197516edf1")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'Behaviour)))
  "Returns md5sum for a message object of type 'Behaviour"
  "9b9d03cec42c32ed5c6a48197516edf1")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<Behaviour>)))
  "Returns full string definition for message of type '<Behaviour>"
  (cl:format cl:nil "string name~%string crs~%Drone[] drones~%~%~%================================================================================~%MSG: flyaq/Drone~%string name~%string type_name~%Coordinate home~%Move[] movements~%MoveTransition[] move_transitions~%string[] slot_names~%int8 SAFE = 0~%int8 NORMAL = 1~%int8 AGGRESSIVE = 2~%int8 travel_mode # enumerated above~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%================================================================================~%MSG: flyaq/Move~%string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/MoveTransition~%bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'Behaviour)))
  "Returns full string definition for message of type 'Behaviour"
  (cl:format cl:nil "string name~%string crs~%Drone[] drones~%~%~%================================================================================~%MSG: flyaq/Drone~%string name~%string type_name~%Coordinate home~%Move[] movements~%MoveTransition[] move_transitions~%string[] slot_names~%int8 SAFE = 0~%int8 NORMAL = 1~%int8 AGGRESSIVE = 2~%int8 travel_mode # enumerated above~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%================================================================================~%MSG: flyaq/Move~%string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/MoveTransition~%bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <Behaviour>))
  (cl:+ 0
     4 (cl:length (cl:slot-value msg 'name))
     4 (cl:length (cl:slot-value msg 'crs))
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'drones) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ (roslisp-msg-protocol:serialization-length ele))))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <Behaviour>))
  "Converts a ROS message object to a list"
  (cl:list 'Behaviour
    (cl:cons ':name (name msg))
    (cl:cons ':crs (crs msg))
    (cl:cons ':drones (drones msg))
))
