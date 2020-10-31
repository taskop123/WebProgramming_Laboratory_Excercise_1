package mk.finki.ukim.wp.lab.service.Impl;

import mk.finki.ukim.wp.lab.model.Balloon;
import mk.finki.ukim.wp.lab.repository.BalloonRepository;
import mk.finki.ukim.wp.lab.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalloonImpl implements BalloonService {

    public final BalloonRepository balloonRepository;

    public BalloonImpl(BalloonRepository balloonRepository) {
        this.balloonRepository = balloonRepository;
    }

    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAllBalloons();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.findAllByNameOrDescription(text);
    }

//    @Override
//    public void SaveOrUpdate(Balloon b) {
//        balloonRepository.saveOrUpdate(b);
//    }


}
