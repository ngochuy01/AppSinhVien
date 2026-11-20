package com.ute.studentmvvm.network

import com.ute.studentmvvm.model.Student


data class StudentDto(
    val id: Int,
    val name: String,
    val username: String,
    val email: String
)

fun StudentDto.toEntity(): Student {
    return Student(
        id = 0, // Để Room tự sinh khóa chính tránh ghi đè
        fullName = name,
        studentCode = "CLOUD_${id.toString().padStart(3, '0')}",
        email = email,
        gpa = 3.50,
        major = "Đồng bộ Cloud"
    )
}