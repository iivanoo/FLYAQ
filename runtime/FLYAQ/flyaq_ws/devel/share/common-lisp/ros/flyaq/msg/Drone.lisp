; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude Drone.msg.html

(cl:defclass <Drone> (roslisp-msg-protocol:ros-message)
  ((name
    :reader name
    :initarg :name
    :type cl:string
    :initform "")
   (type_name
    :reader type_name
    :initarg :type_name
    :type cl:string
    :initform "")
   (home
    :reader home
    :initarg :home
    :type flyaq-msg:Coordinate
    :initform (cl:make-instance 'flyaq-msg:Coordinate))
   (movements
    :reader movements
    :initarg :movements
    :type (cl:vector flyaq-msg:Move)
   :initform (cl:make-array 0 :element-type 'flyaq-msg:Move :initial-element (cl:make-instance 'flyaq-msg:Move)))
   (move_transitions
    :reader move_transitions
    :initarg :move_transitions
    :type (cl:vector flyaq-msg:MoveTransition)
   :initform (cl:make-array 0 :element-type 'flyaq-msg:MoveTransition :initial-element (cl:make-instance 'flyaq-msg:MoveTransition)))
   (slot_names
    :reader slot_names
    :initarg :slot_names
    :type (cl:vector cl:string)
   :initform (cl:make-array 0 :element-type 'cl:string :initial-element ""))
   (travel_mode
    :reader travel_mode
    :initarg :travel_mode
    :type cl:fixnum
    :initform 0))
)

(cl:defclass Drone (<Drone>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <Drone>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'Drone)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<Drone> is deprecated: use flyaq-msg:Drone instead.")))

(cl:ensure-generic-function 'name-val :lambda-list '(m))
(cl:defmethod name-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:name-val is deprecated.  Use flyaq-msg:name instead.")
  (name m))

(cl:ensure-generic-function 'type_name-val :lambda-list '(m))
(cl:defmethod type_name-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:type_name-val is deprecated.  Use flyaq-msg:type_name instead.")
  (type_name m))

(cl:ensure-generic-function 'home-val :lambda-list '(m))
(cl:defmethod home-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:home-val is deprecated.  Use flyaq-msg:home instead.")
  (home m))

(cl:ensure-generic-function 'movements-val :lambda-list '(m))
(cl:defmethod movements-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:movements-val is deprecated.  Use flyaq-msg:movements instead.")
  (movements m))

(cl:ensure-generic-function 'move_transitions-val :lambda-list '(m))
(cl:defmethod move_transitions-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:move_transitions-val is deprecated.  Use flyaq-msg:move_transitions instead.")
  (move_transitions m))

(cl:ensure-generic-function 'slot_names-val :lambda-list '(m))
(cl:defmethod slot_names-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:slot_names-val is deprecated.  Use flyaq-msg:slot_names instead.")
  (slot_names m))

(cl:ensure-generic-function 'travel_mode-val :lambda-list '(m))
(cl:defmethod travel_mode-val ((m <Drone>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:travel_mode-val is deprecated.  Use flyaq-msg:travel_mode instead.")
  (travel_mode m))
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql '<Drone>)))
    "Constants for message type '<Drone>"
  '((:SAFE . 0)
    (:NORMAL . 1)
    (:AGGRESSIVE . 2))
)
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql 'Drone)))
    "Constants for message type 'Drone"
  '((:SAFE . 0)
    (:NORMAL . 1)
    (:AGGRESSIVE . 2))
)
(cl:defmethod roslisp-msg-protocol:serialize ((msg <Drone>) ostream)
  "Serializes a message object of type '<Drone>"
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'name))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'type_name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'type_name))
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'home) ostream)
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'movements))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (roslisp-msg-protocol:serialize ele ostream))
   (cl:slot-value msg 'movements))
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'move_transitions))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (roslisp-msg-protocol:serialize ele ostream))
   (cl:slot-value msg 'move_transitions))
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'slot_names))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (cl:let ((__ros_str_len (cl:length ele)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) ele))
   (cl:slot-value msg 'slot_names))
  (cl:let* ((signed (cl:slot-value msg 'travel_mode)) (unsigned (cl:if (cl:< signed 0) (cl:+ signed 256) signed)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) unsigned) ostream)
    )
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <Drone>) istream)
  "Deserializes a message object of type '<Drone>"
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
      (cl:setf (cl:slot-value msg 'type_name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'type_name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'home) istream)
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'movements) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'movements)))
    (cl:dotimes (i __ros_arr_len)
    (cl:setf (cl:aref vals i) (cl:make-instance 'flyaq-msg:Move))
  (roslisp-msg-protocol:deserialize (cl:aref vals i) istream))))
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'move_transitions) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'move_transitions)))
    (cl:dotimes (i __ros_arr_len)
    (cl:setf (cl:aref vals i) (cl:make-instance 'flyaq-msg:MoveTransition))
  (roslisp-msg-protocol:deserialize (cl:aref vals i) istream))))
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'slot_names) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'slot_names)))
    (cl:dotimes (i __ros_arr_len)
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:aref vals i) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:aref vals i) __ros_str_idx) (cl:code-char (cl:read-byte istream))))))))
    (cl:let ((unsigned 0))
      (cl:setf (cl:ldb (cl:byte 8 0) unsigned) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'travel_mode) (cl:if (cl:< unsigned 128) unsigned (cl:- unsigned 256))))
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<Drone>)))
  "Returns string type for a message object of type '<Drone>"
  "flyaq/Drone")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'Drone)))
  "Returns string type for a message object of type 'Drone"
  "flyaq/Drone")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<Drone>)))
  "Returns md5sum for a message object of type '<Drone>"
  "56e1e8c457cd00b6794878ca6f4e0be2")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'Drone)))
  "Returns md5sum for a message object of type 'Drone"
  "56e1e8c457cd00b6794878ca6f4e0be2")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<Drone>)))
  "Returns full string definition for message of type '<Drone>"
  (cl:format cl:nil "string name~%string type_name~%Coordinate home~%Move[] movements~%MoveTransition[] move_transitions~%string[] slot_names~%int8 SAFE = 0~%int8 NORMAL = 1~%int8 AGGRESSIVE = 2~%int8 travel_mode # enumerated above~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%================================================================================~%MSG: flyaq/Move~%string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/MoveTransition~%bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'Drone)))
  "Returns full string definition for message of type 'Drone"
  (cl:format cl:nil "string name~%string type_name~%Coordinate home~%Move[] movements~%MoveTransition[] move_transitions~%string[] slot_names~%int8 SAFE = 0~%int8 NORMAL = 1~%int8 AGGRESSIVE = 2~%int8 travel_mode # enumerated above~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%================================================================================~%MSG: flyaq/Move~%string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/MoveTransition~%bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <Drone>))
  (cl:+ 0
     4 (cl:length (cl:slot-value msg 'name))
     4 (cl:length (cl:slot-value msg 'type_name))
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'home))
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'movements) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ (roslisp-msg-protocol:serialization-length ele))))
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'move_transitions) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ (roslisp-msg-protocol:serialization-length ele))))
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'slot_names) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ 4 (cl:length ele))))
     1
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <Drone>))
  "Converts a ROS message object to a list"
  (cl:list 'Drone
    (cl:cons ':name (name msg))
    (cl:cons ':type_name (type_name msg))
    (cl:cons ':home (home msg))
    (cl:cons ':movements (movements msg))
    (cl:cons ':move_transitions (move_transitions msg))
    (cl:cons ':slot_names (slot_names msg))
    (cl:cons ':travel_mode (travel_mode msg))
))
