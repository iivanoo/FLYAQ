; Auto-generated. Do not edit!


(cl:in-package flyaq-msg)


;//! \htmlinclude MoveTransition.msg.html

(cl:defclass <MoveTransition> (roslisp-msg-protocol:ros-message)
  ((is_choice
    :reader is_choice
    :initarg :is_choice
    :type cl:boolean
    :initform cl:nil)
   (wait_for_slot_name
    :reader wait_for_slot_name
    :initarg :wait_for_slot_name
    :type cl:string
    :initform "")
   (from_move_name
    :reader from_move_name
    :initarg :from_move_name
    :type cl:string
    :initform "")
   (to_move_name
    :reader to_move_name
    :initarg :to_move_name
    :type cl:string
    :initform "")
   (fluid
    :reader fluid
    :initarg :fluid
    :type cl:boolean
    :initform cl:nil)
   (condition_identifier
    :reader condition_identifier
    :initarg :condition_identifier
    :type cl:string
    :initform "")
   (false_branch_move_name
    :reader false_branch_move_name
    :initarg :false_branch_move_name
    :type cl:string
    :initform ""))
)

(cl:defclass MoveTransition (<MoveTransition>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <MoveTransition>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'MoveTransition)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name flyaq-msg:<MoveTransition> is deprecated: use flyaq-msg:MoveTransition instead.")))

(cl:ensure-generic-function 'is_choice-val :lambda-list '(m))
(cl:defmethod is_choice-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:is_choice-val is deprecated.  Use flyaq-msg:is_choice instead.")
  (is_choice m))

(cl:ensure-generic-function 'wait_for_slot_name-val :lambda-list '(m))
(cl:defmethod wait_for_slot_name-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:wait_for_slot_name-val is deprecated.  Use flyaq-msg:wait_for_slot_name instead.")
  (wait_for_slot_name m))

(cl:ensure-generic-function 'from_move_name-val :lambda-list '(m))
(cl:defmethod from_move_name-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:from_move_name-val is deprecated.  Use flyaq-msg:from_move_name instead.")
  (from_move_name m))

(cl:ensure-generic-function 'to_move_name-val :lambda-list '(m))
(cl:defmethod to_move_name-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:to_move_name-val is deprecated.  Use flyaq-msg:to_move_name instead.")
  (to_move_name m))

(cl:ensure-generic-function 'fluid-val :lambda-list '(m))
(cl:defmethod fluid-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:fluid-val is deprecated.  Use flyaq-msg:fluid instead.")
  (fluid m))

(cl:ensure-generic-function 'condition_identifier-val :lambda-list '(m))
(cl:defmethod condition_identifier-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:condition_identifier-val is deprecated.  Use flyaq-msg:condition_identifier instead.")
  (condition_identifier m))

(cl:ensure-generic-function 'false_branch_move_name-val :lambda-list '(m))
(cl:defmethod false_branch_move_name-val ((m <MoveTransition>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader flyaq-msg:false_branch_move_name-val is deprecated.  Use flyaq-msg:false_branch_move_name instead.")
  (false_branch_move_name m))
(cl:defmethod roslisp-msg-protocol:serialize ((msg <MoveTransition>) ostream)
  "Serializes a message object of type '<MoveTransition>"
  (cl:write-byte (cl:ldb (cl:byte 8 0) (cl:if (cl:slot-value msg 'is_choice) 1 0)) ostream)
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'wait_for_slot_name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'wait_for_slot_name))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'from_move_name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'from_move_name))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'to_move_name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'to_move_name))
  (cl:write-byte (cl:ldb (cl:byte 8 0) (cl:if (cl:slot-value msg 'fluid) 1 0)) ostream)
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'condition_identifier))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'condition_identifier))
  (cl:let ((__ros_str_len (cl:length (cl:slot-value msg 'false_branch_move_name))))
    (cl:write-byte (cl:ldb (cl:byte 8 0) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 8) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 16) __ros_str_len) ostream)
    (cl:write-byte (cl:ldb (cl:byte 8 24) __ros_str_len) ostream))
  (cl:map cl:nil #'(cl:lambda (c) (cl:write-byte (cl:char-code c) ostream)) (cl:slot-value msg 'false_branch_move_name))
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <MoveTransition>) istream)
  "Deserializes a message object of type '<MoveTransition>"
    (cl:setf (cl:slot-value msg 'is_choice) (cl:not (cl:zerop (cl:read-byte istream))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'wait_for_slot_name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'wait_for_slot_name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'from_move_name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'from_move_name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'to_move_name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'to_move_name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:setf (cl:slot-value msg 'fluid) (cl:not (cl:zerop (cl:read-byte istream))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'condition_identifier) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'condition_identifier) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
    (cl:let ((__ros_str_len 0))
      (cl:setf (cl:ldb (cl:byte 8 0) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 8) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 16) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:ldb (cl:byte 8 24) __ros_str_len) (cl:read-byte istream))
      (cl:setf (cl:slot-value msg 'false_branch_move_name) (cl:make-string __ros_str_len))
      (cl:dotimes (__ros_str_idx __ros_str_len msg)
        (cl:setf (cl:char (cl:slot-value msg 'false_branch_move_name) __ros_str_idx) (cl:code-char (cl:read-byte istream)))))
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<MoveTransition>)))
  "Returns string type for a message object of type '<MoveTransition>"
  "flyaq/MoveTransition")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'MoveTransition)))
  "Returns string type for a message object of type 'MoveTransition"
  "flyaq/MoveTransition")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<MoveTransition>)))
  "Returns md5sum for a message object of type '<MoveTransition>"
  "d6b577bdbfc0416bf6dfa5e8a4570219")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'MoveTransition)))
  "Returns md5sum for a message object of type 'MoveTransition"
  "d6b577bdbfc0416bf6dfa5e8a4570219")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<MoveTransition>)))
  "Returns full string definition for message of type '<MoveTransition>"
  (cl:format cl:nil "bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'MoveTransition)))
  "Returns full string definition for message of type 'MoveTransition"
  (cl:format cl:nil "bool is_choice # true if the move transition is a Choice move transition~%string wait_for_slot_name~%string from_move_name~%string to_move_name~%bool fluid~%string condition_identifier # filled only in case of Choice move transition~%string false_branch_move_name # filled only in case of Choice move transition~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <MoveTransition>))
  (cl:+ 0
     1
     4 (cl:length (cl:slot-value msg 'wait_for_slot_name))
     4 (cl:length (cl:slot-value msg 'from_move_name))
     4 (cl:length (cl:slot-value msg 'to_move_name))
     1
     4 (cl:length (cl:slot-value msg 'condition_identifier))
     4 (cl:length (cl:slot-value msg 'false_branch_move_name))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <MoveTransition>))
  "Converts a ROS message object to a list"
  (cl:list 'MoveTransition
    (cl:cons ':is_choice (is_choice msg))
    (cl:cons ':wait_for_slot_name (wait_for_slot_name msg))
    (cl:cons ':from_move_name (from_move_name msg))
    (cl:cons ':to_move_name (to_move_name msg))
    (cl:cons ':fluid (fluid msg))
    (cl:cons ':condition_identifier (condition_identifier msg))
    (cl:cons ':false_branch_move_name (false_branch_move_name msg))
))
