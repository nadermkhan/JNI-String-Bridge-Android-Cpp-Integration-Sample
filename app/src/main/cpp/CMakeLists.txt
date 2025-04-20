cmake_minimum_required(VERSION 3.4.1)

add_library(
        nader
        SHARED
        nader.cpp)

find_library(
        log-lib
        log)

target_link_libraries(
        nader
        ${log-lib})
