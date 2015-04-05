# generated from genmsg/cmake/pkg-genmsg.cmake.em

message(STATUS "flyaq: 10 messages, 0 services")

set(MSG_I_FLAGS "-Iflyaq:/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg;-Istd_msgs:/opt/ros/groovy/share/std_msgs/msg")

# Find all generators
find_package(gencpp REQUIRED)
find_package(genlisp REQUIRED)
find_package(genpy REQUIRED)

#better way to handle this?
set (ALL_GEN_OUTPUT_FILES_cpp "")

#
#  langs = gencpp;genlisp;genpy
#

### Section generating for lang: gencpp
### Generating Messages
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Behaviour.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Command.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/CommandReturn.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Feedback.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)
_generate_msg_cpp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
)

### Generating Services

### Generating Module File
_generate_module_cpp(flyaq
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
  "${ALL_GEN_OUTPUT_FILES_cpp}"
)

add_custom_target(flyaq_gencpp ALL
  DEPENDS ${ALL_GEN_OUTPUT_FILES_cpp}
)

### Section generating for lang: genlisp
### Generating Messages
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Behaviour.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Command.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/CommandReturn.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Feedback.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)
_generate_msg_lisp(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
)

### Generating Services

### Generating Module File
_generate_module_lisp(flyaq
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
  "${ALL_GEN_OUTPUT_FILES_lisp}"
)

add_custom_target(flyaq_genlisp ALL
  DEPENDS ${ALL_GEN_OUTPUT_FILES_lisp}
)

### Section generating for lang: genpy
### Generating Messages
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Behaviour.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Command.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/CommandReturn.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Drone.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Feedback.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Move.msg
  "${MSG_I_FLAGS}"
  "/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Action.msg;/home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Coordinate.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/MoveTransition.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)
_generate_msg_py(flyaq
  /home/viki/Desktop/FLYAQ/flyaq_ws/src/flyaq/msg/Parameter.msg
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
)

### Generating Services

### Generating Module File
_generate_module_py(flyaq
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
  "${ALL_GEN_OUTPUT_FILES_py}"
)

add_custom_target(flyaq_genpy ALL
  DEPENDS ${ALL_GEN_OUTPUT_FILES_py}
)


debug_message(2 "flyaq: Iflags=${MSG_I_FLAGS}")


if(gencpp_INSTALL_DIR)
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/flyaq
    DESTINATION ${gencpp_INSTALL_DIR}
  )
endif()
add_dependencies(flyaq_gencpp std_msgs_gencpp)

if(genlisp_INSTALL_DIR)
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/flyaq
    DESTINATION ${genlisp_INSTALL_DIR}
  )
endif()
add_dependencies(flyaq_genlisp std_msgs_genlisp)

if(genpy_INSTALL_DIR)
  install(CODE "execute_process(COMMAND \"/usr/bin/python\" -m compileall \"${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq\")")
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/flyaq
    DESTINATION ${genpy_INSTALL_DIR}
  )
endif()
add_dependencies(flyaq_genpy std_msgs_genpy)
