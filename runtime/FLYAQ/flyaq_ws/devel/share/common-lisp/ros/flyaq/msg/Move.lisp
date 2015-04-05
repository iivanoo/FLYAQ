; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude Move.msg.html

(cl:defclass <Move> (roslisp-msg-protocol:ros-message)
  ((name
    :reader name
    :initarg :name
    :type cl:string
    :initform "")
   (type
    :reader type
    :initarg :type
    :type cl:fixnum
    :initform 0)
   (pre_actions
    :reader pre_actions
    :initarg :pre_actions
    :type (cl:vector flyaq-msg:Action)
   :initform (cl:make-array 0 :element-type 'flyaq-msg:Action :initial-element (cl:make-instance 'flyaq-msg:Action)))
   (post_actions
    :reader post_actions
    :initarg :post_actions
    :type (cl:vector flyaq-msg:Action)
   :initform (cl:make-array 0 :element-type 'flyaq-msg:Action :initial-element (cl:make-instance 'flyaq-msg:Action)))
   (altitude
    :reader altitude
    :initarg :altitude
    :type cl:float
    :initform 0.0)
   (target_position
    :reader target_position
    :initarg :target_position
    :type flyaq-msg:Coordinate
    :initform (cl:make-instance 'flyaq-msg:Coordinate))
   (strategy
    :reader strategy
    :initarg :strategy
    :type cl:fixnum
    :initform 0)
   (duration
    :reader duration
    :initarg :duration
    :type cl:real
    :initform 0)
   (radius
    :reader radius
    :initarg :radius
    :type cl:float
    :initform 0.0)
   (circle_altitude
    :reader circle_altitude
    :initarg :circle_altitude
    :type cl:float
    :initform 0.0)
   (clockwise
    :reader clockwise
    :initarg :clockwise
    :type cl:boolean
    :initform cl:nil)
   (direction
    :reader direction
    :initarg :direction
    :type cl:float
    :initform 0.0))
)

(cl:defclass Move (<Move>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <Move>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'Move)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<Move> is deprecated: use flyaq-msg:Move instead.")))

(cl:ensure-generic-function 'name-val :lambda-list '(m))
(cl:defmethod name-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:name-val is deprecated.  Use flyaq-msg:name instead.")
  (name m))

(cl:ensure-generic-function 'type-val :lambda-list '(m))
(cl:defmethod type-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:type-val is deprecated.  Use flyaq-msg:type instead.")
  (type m))

(cl:ensure-generic-function 'pre_actions-val :lambda-list '(m))
(cl:defmethod pre_actions-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:pre_actions-val is deprecated.  Use flyaq-msg:pre_actions instead.")
  (pre_actions m))

(cl:ensure-generic-function 'post_actions-val :lambda-list '(m))
(cl:defmethod post_actions-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:post_actions-val is deprecated.  Use flyaq-msg:post_actions instead.")
  (post_actions m))

(cl:ensure-generic-function 'altitude-val :lambda-list '(m))
(cl:defmethod altitude-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:altitude-val is deprecated.  Use flyaq-msg:altitude instead.")
  (altitude m))

(cl:ensure-generic-function 'target_position-val :lambda-list '(m))
(cl:defmethod target_position-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:target_position-val is deprecated.  Use flyaq-msg:target_position instead.")
  (target_position m))

(cl:ensure-generic-function 'strategy-val :lambda-list '(m))
(cl:defmethod strategy-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:strategy-val is deprecated.  Use flyaq-msg:strategy instead.")
  (strategy m))

(cl:ensure-generic-function 'duration-val :lambda-list '(m))
(cl:defmethod duration-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:duration-val is deprecated.  Use flyaq-msg:duration instead.")
  (duration m))

(cl:ensure-generic-function 'radius-val :lambda-list '(m))
(cl:defmethod radius-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:radius-val is deprecated.  Use flyaq-msg:radius instead.")
  (radius m))

(cl:ensure-generic-function 'circle_altitude-val :lambda-list '(m))
(cl:defmethod circle_altitude-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:circle_altitude-val is deprecated.  Use flyaq-msg:circle_altitude instead.")
  (circle_altitude m))

(cl:ensure-generic-function 'clockwise-val :lambda-list '(m))
(cl:defmethod clockwise-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:clockwise-val is deprecated.  Use flyaq-msg:clockwise instead.")
  (clockwise m))

(cl:ensure-generic-function 'direction-val :lambda-list '(m))
(cl:defmethod direction-val ((m <Move>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:direction-val is deprecated.  Use flyaq-msg:direction instead.")
  (direction m))
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql '<Move>)))
    "Constants for message type '<Move>"
  '((:START . 0)
    (:STOP . 1)
    (:TAKE_OFF . 2)
    (:LAND . 3)
    (:GO_TO . 4)
    (:HOVER . 5)
    (:CIRCLE . 6)
    (:HEAD_TO . 7)
    (:DIRECT . 0)
    (:HORIZONTAL_FIRST . 1)
    (:VERTICAL_FIRST . 2))
)
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql 'Move)))
    "Constants for message type 'Move"
  '((:START . 0)
    (:STOP . 1)
    (:TAKE_OFF . 2)
    (:LAND . 3)
    (:GO_TO . 4)
    (:HOVER . 5)
    (:CIRCLE . 6)
    (:HEAD_TO . 7)
    (:DIRECT . 0)
    (:HORIZONTAL_FIRST . 1)
    (:VERTICAL_FIRST . 2))
)
(cl:defmethod roslisp-msg-protocol:serialize ((msg <Move>) ostream)
  "Serializes a message object of type '<Move>"
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'name))
  (cl:let* ((signed (cl:slot-value msg 'type)) (unsigned (cl:if (cl:< signed 0) (cl:+ signed 256) signed)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) unsigned) ostream)
    )
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'pre_actions))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (roslisp-msg-protocol:serialize ele ostream))
   (cl:slot-value msg 'pre_actions))
  (cl:let ((__ros_arr_len (cl:length (cl:slot-value msg 'post_actions))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_arr_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_arr_len) ostream))
  (cl:map cl:nil #'(cl:lambda (ele) (roslisp-msg-protocol:serialize ele ostream))
   (cl:slot-value msg 'post_actions))
  (cl:let ((bits (roslisp-utils:encode-single-float-bits (cl:slot-value msg 'altitude))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) bits) ostream))
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'target_position) ostream)
  (cl:let* ((signed (cl:slot-value msg 'strategy)) (unsigned (cl:if (cl:< signed 0) (cl:+ signed 256) signed)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) unsigned) ostream)
    )
  (cl:let ((__sec (cl:floor (cl:slot-value msg 'duration)))
        (__nsec (cl:round (cl:* 1e9 (cl:- (cl:slot-value msg 'duration) (cl:floor (cl:slot-value msg 'duration)))))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __sec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __sec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __sec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __sec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 0) __nsec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __nsec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __nsec) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __nsec) ostream))
  (cl:let ((bits (roslisp-utils:encode-single-float-bits (cl:slot-value msg 'radius))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) bits) ostream))
  (cl:let ((bits (roslisp-utils:encode-single-float-bits (cl:slot-value msg 'circle_altitude))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) bits) ostream))
  (cl:write-byte (cl:ldb (cl:byte 8 0) (cl:if (cl:slot-value msg 'clockwise) 1 0)) ostream)
  (cl:let ((bits (roslisp-utils:encode-single-float-bits (cl:slot-value msg 'direction))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) bits) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) bits) ostream))
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <Move>) istream)
  "Deserializes a message object of type '<Move>"
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:let ((unsigned 0))
      (cl:setf (cl:ldb (cl:byte 8 0) unsigned) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'type) (cl:if (cl:< unsigned 128) unsigned (cl:- unsigned 256))))
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'pre_actions) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'pre_actions)))
    (cl:dotimes (i __ros_arr_len)
    (cl:setf (cl:aref vals i) (cl:make-instance 'flyaq-msg:Action))
  (roslisp-msg-protocol:deserialize (cl:aref vals i) istream))))
  (cl:let ((__ros_arr_len 0))
    (cl:setf (cl:ldb (cl:byte 8 0) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 8) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 16) __ros_arr_len) (cl:read-byte istream))
    (cl:setf (cl:ldb (cl:byte 8 24) __ros_arr_len) (cl:read-byte istream))
  (cl:setf (cl:slot-value msg 'post_actions) (cl:make-array __ros_arr_len))
  (cl:let ((vals (cl:slot-value msg 'post_actions)))
    (cl:dotimes (i __ros_arr_len)
    (cl:setf (cl:aref vals i) (cl:make-instance 'flyaq-msg:Action))
  (roslisp-msg-protocol:deserialize (cl:aref vals i) istream))))
    (cl:let ((bits 0))
      (cl:setf (cl:ldb (cl:byte 8 0) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) bits) (cl:read-byte istream))
    (cl:setf (cl:slot-value msg 'altitude) (roslisp-utils:decode-single-float-bits bits)))
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'target_position) istream)
    (cl:let ((unsigned 0))
      (cl:setf (cl:ldb (cl:byte 8 0) unsigned) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'strategy) (cl:if (cl:< unsigned 128) unsigned (cl:- unsigned 256))))
    (cl:let ((__sec 0) (__nsec 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __sec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __sec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __sec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __sec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 0) __nsec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __nsec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __nsec) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __nsec) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'duration) (cl:+ (cl:coerce __sec 'cl:double-float) (cl:/ __nsec 1e9))))
    (cl:let ((bits 0))
      (cl:setf (cl:ldb (cl:byte 8 0) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) bits) (cl:read-byte istream))
    (cl:setf (cl:slot-value msg 'radius) (roslisp-utils:decode-single-float-bits bits)))
    (cl:let ((bits 0))
      (cl:setf (cl:ldb (cl:byte 8 0) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) bits) (cl:read-byte istream))
    (cl:setf (cl:slot-value msg 'circle_altitude) (roslisp-utils:decode-single-float-bits bits)))
    (cl:setf (cl:slot-value msg 'clockwise) (cl:not (cl:zerop (cl:read-byte istream))))
    (cl:let ((bits 0))
      (cl:setf (cl:ldb (cl:byte 8 0) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) bits) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) bits) (cl:read-byte istream))
    (cl:setf (cl:slot-value msg 'direction) (roslisp-utils:decode-single-float-bits bits)))
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<Move>)))
  "Returns string type for a message object of type '<Move>"
  "flyaq/Move")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'Move)))
  "Returns string type for a message object of type 'Move"
  "flyaq/Move")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<Move>)))
  "Returns md5sum for a message object of type '<Move>"
  "f90cd9c8abd82ddcb255e24ed8f258a2")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'Move)))
  "Returns md5sum for a message object of type 'Move"
  "f90cd9c8abd82ddcb255e24ed8f258a2")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<Move>)))
  "Returns full string definition for message of type '<Move>"
  (cl:format cl:nil "string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'Move)))
  "Returns full string definition for message of type 'Move"
  (cl:format cl:nil "string name~%int8 START = 0~%int8 STOP = 1~%int8 TAKE_OFF = 2~%int8 LAND = 3~%int8 GO_TO = 4~%int8 HOVER = 5~%int8 CIRCLE = 6~%int8 HEAD_TO = 7~%int8 type # enumerate above~%Action[] pre_actions~%Action[] post_actions~%float32 altitude # filled only in case of TakeOff move~%Coordinate target_position # filled only in case of GoTo or Circle moves~%int8 DIRECT = 0~%int8 HORIZONTAL_FIRST = 1~%int8 VERTICAL_FIRST = 2~%int8 strategy # enumerated above, filled only in case of GoTo move~%duration duration # filled only in case of Hover or Circle moves~%float32 radius # filled only in case of Circle move~%float32 circle_altitude # filled only in case of Circle move~%bool clockwise # filled only in case of Circle move~%float32 direction # filled only in case of HeadTo move ~%~%================================================================================~%MSG: flyaq/Action~%string name~%int8 DEVICE = 0~%int8 FEEDBACK = 1~%~%int8 CHECK = 2~%~%int8 UNICAST_NOTIFY = 3~%~%int8 MULTICAST_NOTIFY = 4~%~%int8 BROADCAST_NOTIFY = 5~%~%int8 type # enumerate above~%~%string action_name # filled only in case of DeviceAction and Feedback~%~%Parameter[] parameters # filled only in case of DeviceAction and Feedback~%~%string slot_name # filled only in case of Notify (any kind) or CheckNotification~%~%string[] receivers_name # filled only in case of MulticastNotify or UnicastNotify~%~%~%================================================================================~%MSG: flyaq/Parameter~%string key~%string value~%~%================================================================================~%MSG: flyaq/Coordinate~%float32 latitude~%float32 longitude~%float32 altitude~%float32 heading~%~%~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <Move>))
  (cl:+ 0
     4 (cl:length (cl:slot-value msg 'name))
     1
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'pre_actions) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ (roslisp-msg-protocol:serialization-length ele))))
     4 (cl:reduce #'cl:+ (cl:slot-value msg 'post_actions) :key #'(cl:lambda (ele) (cl:declare (cl:ignorable ele)) (cl:+ (roslisp-msg-protocol:serialization-length ele))))
     4
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'target_position))
     1
     8
     4
     4
     1
     4
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <Move>))
  "Converts a ROS message object to a list"
  (cl:list 'Move
    (cl:cons ':name (name msg))
    (cl:cons ':type (type msg))
    (cl:cons ':pre_actions (pre_actions msg))
    (cl:cons ':post_actions (post_actions msg))
    (cl:cons ':altitude (altitude msg))
    (cl:cons ':target_position (target_position msg))
    (cl:cons ':strategy (strategy msg))
    (cl:cons ':duration (duration msg))
    (cl:cons ':radius (radius msg))
    (cl:cons ':circle_altitude (circle_altitude msg))
    (cl:cons ':clockwise (clockwise msg))
    (cl:cons ':direction (direction msg))
))
