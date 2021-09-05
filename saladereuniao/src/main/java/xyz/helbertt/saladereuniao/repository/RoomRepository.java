package xyz.helbertt.saladereuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.helbertt.saladereuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
