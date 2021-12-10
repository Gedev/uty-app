package technobel.gedev.utyapp.models.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classroom_reservation")
@Getter @Setter
@ToString
public class ClassroomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String room_num;

    @Column
    private int start_time;

    @Column
    private int end_time;

    @Column(columnDefinition = "boolean default true")
    private boolean status;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<RoomEquipment> roomEquipments;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
