; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude Command.msg.html

(cl:defclass <Command> (roslisp-msg-protocol:ros-message)
  ((command
    :reader command
    :initarg :command
    :type cl:fixnum
    :initform 0)
   (drone
    :reader drone
    :initarg :drone
    :type cl:string
    :initform ""))
)

(cl:defclass Command (<Command>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <Command>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'Command)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<Command> is deprecated: use flyaq-msg:Command instead.")))

(cl:ensure-generic-function 'command-val :lambda-list '(m))
(cl:defmethod command-val ((m <Command>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:command-val is deprecated.  Use flyaq-msg:command instead.")
  (command m))

(cl:ensure-generic-function 'drone-val :lambda-list '(m))
(cl:defmethod drone-val ((m <Command>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:drone-val is deprecated.  Use flyaq-msg:drone instead.")
  (drone m))
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql '<Command>)))
    "Constants for message type '<Command>"
  '((:IS_ALIVE . 0)
    (:IS_MISSION_LOADED . 1)
    (:SETUP_DRONE . 2)
    (:START_MISSION . 3)
    (:STOP_MISSION . 4))
)
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql 'Command)))
    "Constants for message type 'Command"
  '((:IS_ALIVE . 0)
    (:IS_MISSION_LOADED . 1)
    (:SETUP_DRONE . 2)
    (:START_MISSION . 3)
    (:STOP_MISSION . 4))
)
(cl:defmethod roslisp-msg-protocol:serialize ((msg <Command>) ostream)
  "Serializes a message object of type '<Command>"
  (cl:let* ((signed (cl:slot-value msg 'command)) (unsigned (cl:if (cl:< signed 0) (cl:+ signed 256) signed)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) unsigned) ostream)
    )
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'drone))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'drone))
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <Command>) istream)
  "Deserializes a message object of type '<Command>"
    (cl:let ((unsigned 0))
      (cl:setf (cl:ldb (cl:byte 8 0) unsigned) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'command) (cl:if (cl:< unsigned 128) unsigned (cl:- unsigned 256))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'drone) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'drone) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<Command>)))
  "Returns string type for a message object of type '<Command>"
  "flyaq/Command")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'Command)))
  "Returns string type for a message object of type 'Command"
  "flyaq/Command")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<Command>)))
  "Returns md5sum for a message object of type '<Command>"
  "1651afd08b27f2ffa0a08b600f532ccf")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'Command)))
  "Returns md5sum for a message object of type 'Command"
  "1651afd08b27f2ffa0a08b600f532ccf")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<Command>)))
  "Returns full string definition for message of type '<Command>"
  (cl:format cl:nil "int8 IS_ALIVE = 0~%int8 IS_MISSION_LOADED = 1~%int8 SETUP_DRONE = 2~%int8 START_MISSION = 3~%int8 STOP_MISSION = 4~%int8 command # enumerate above~%~%# drone that must execute the command~%string drone # can be also ALL or NONE~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'Command)))
  "Returns full string definition for message of type 'Command"
  (cl:format cl:nil "int8 IS_ALIVE = 0~%int8 IS_MISSION_LOADED = 1~%int8 SETUP_DRONE = 2~%int8 START_MISSION = 3~%int8 STOP_MISSION = 4~%int8 command # enumerate above~%~%# drone that must execute the command~%string drone # can be also ALL or NONE~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <Command>))
  (cl:+ 0
     1
     4 (cl:length (cl:slot-value msg 'drone))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <Command>))
  "Converts a ROS message object to a list"
  (cl:list 'Command
    (cl:cons ':command (command msg))
    (cl:cons ':drone (drone msg))
))
