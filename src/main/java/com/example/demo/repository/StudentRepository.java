package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;
@Repository
public interface StudentRepository extents JpaRepository<Student,Integer>{
    
}n failure: Compilation failure: 
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/StudentController.java:[16,35] ';' expected
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/StudentRepository.java:[6,35] '{' expected
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/StudentRepository.java:[6,57] class, interface, enum, or record expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.