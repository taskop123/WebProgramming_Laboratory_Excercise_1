package mk.finki.ukim.wp.lab.repository;

import mk.finki.ukim.wp.lab.model.Balloon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

    public final List<Balloon> balloons = new ArrayList<>(){
        {
            add(new Balloon("Crven", "Crven Balon"));
            add(new Balloon("Zelen", "Zelen Balon"));
            add(new Balloon("Zholt", "Zholt Balon"));
            add(new Balloon("Sin", "Sin Balon"));
            add(new Balloon("Crn", "Crn Balon"));
            add(new Balloon("Portokalov", "Portokalov Balon"));
            add(new Balloon("Bel", "Bel Balon"));
            add(new Balloon("Rozov", "Rozov Balon"));
            add(new Balloon("Kafeav", "Kafeav Balon"));
            add(new Balloon("Zlaten", "Zlaten Balon"));
        }
    };

    public List<Balloon> findAllBalloons(){
        return balloons;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return balloons.stream().filter(r -> r.getName().contains(text) || r.getDescription().contains(text)).collect(Collectors.toList());
    }
    public void saveOrUpdate(Balloon b){
        balloons.removeIf(r -> r.getName().equals(b.getName()) && r.getDescription().equals(b.getDescription()));
    }

}
