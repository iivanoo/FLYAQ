; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude CommandReturn.msg.html

(cl:defclass <CommandReturn> (roslisp-msg-protocol:ros-message)
  ((outcome
    :reader outcome
    :initarg :outcome
    :type cl:fixnum
    :initform 0)
   (message
    :reader message
    :initarg :message
    :type cl:string
    :initform "")
   (drone
    :reader drone
    :initarg :drone
    :type cl:string
    :initform ""))
)

(cl:defclass CommandReturn (<CommandReturn>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <CommandReturn>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'CommandReturn)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<CommandReturn> is deprecated: use flyaq-msg:CommandReturn instead.")))

(cl:ensure-generic-function 'outcome-val :lambda-list '(m))
(cl:defmethod outcome-val ((m <CommandReturn>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:outcome-val is deprecated.  Use flyaq-msg:outcome instead.")
  (outcome m))

(cl:ensure-generic-function 'message-val :lambda-list '(m))
(cl:defmethod message-val ((m <CommandReturn>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:message-val is deprecated.  Use flyaq-msg:message instead.")
  (message m))

(cl:ensure-generic-function 'drone-val :lambda-list '(m))
(cl:defmethod drone-val ((m <CommandReturn>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:drone-val is deprecated.  Use flyaq-msg:drone instead.")
  (drone m))
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql '<CommandReturn>)))
    "Constants for message type '<CommandReturn>"
  '((:FAIL . 0)
    (:SUCCESS . 1))
)
(cl:defmethod roslisp-msg-protocol:symbol-codes ((msg-type (cl:eql 'CommandReturn)))
    "Constants for message type 'CommandReturn"
  '((:FAIL . 0)
    (:SUCCESS . 1))
)
(cl:defmethod roslisp-msg-protocol:serialize ((msg <CommandReturn>) ostream)
  "Serializes a message object of type '<CommandReturn>"
  (cl:let* ((signed (cl:slot-value msg 'outcome)) (unsigned (cl:if (cl:< signed 0) (cl:+ signed 256) signed)))
    (cl:write-byte (cl:ldb (cl:byte 8 0) unsigned) ostream)
    )
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'message))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'message))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'drone))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'drone))
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <CommandReturn>) istream)
  "Deserializes a message object of type '<CommandReturn>"
    (cl:let ((unsigned 0))
      (cl:setf (cl:ldb (cl:byte 8 0) unsigned) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'outcome) (cl:if (cl:< unsigned 128) unsigned (cl:- unsigned 256))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'message) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'message) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
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
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<CommandReturn>)))
  "Returns string type for a message object of type '<CommandReturn>"
  "flyaq/CommandReturn")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'CommandReturn)))
  "Returns string type for a message object of type 'CommandReturn"
  "flyaq/CommandReturn")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<CommandReturn>)))
  "Returns md5sum for a message object of type '<CommandReturn>"
  "bb5553c5ccbc2bab658bdc4f34667302")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'CommandReturn)))
  "Returns md5sum for a message object of type 'CommandReturn"
  "bb5553c5ccbc2bab658bdc4f34667302")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<CommandReturn>)))
  "Returns full string definition for message of type '<CommandReturn>"
  (cl:format cl:nil "int8 FAIL = 0~%int8 SUCCESS = 1~%int8 outcome # enumerate above~%string message~%string drone # the drone that executed the command, can be also NONE~%~%~%~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'CommandReturn)))
  "Returns full string definition for message of type 'CommandReturn"
  (cl:format cl:nil "int8 FAIL = 0~%int8 SUCCESS = 1~%int8 outcome # enumerate above~%string message~%string drone # the drone that executed the command, can be also NONE~%~%~%~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <CommandReturn>))
  (cl:+ 0
     1
     4 (cl:length (cl:slot-value msg 'message))
     4 (cl:length (cl:slot-value msg 'drone))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <CommandReturn>))
  "Converts a ROS message object to a list"
  (cl:list 'CommandReturn
    (cl:cons ':outcome (outcome msg))
    (cl:cons ':message (message msg))
    (cl:cons ':drone (drone msg))
))
