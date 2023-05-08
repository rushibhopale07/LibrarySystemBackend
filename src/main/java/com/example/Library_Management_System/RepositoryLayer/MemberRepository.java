package com.example.Library_Management_System.RepositoryLayer;
import com.example.Library_Management_System.EntityLayer.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByUsername(String username);
}
