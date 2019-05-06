package com.example.demo.service.impl;

import com.example.demo.persistent.entity.Feedback;
import com.example.demo.persistent.repository.FeedbackRepository;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.dto.FeedbackDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public List<FeedbackDTO> getAll(){
        List<Feedback> feedbacks = feedbackRepository.findALl();
        List<FeedbackDTO> feedbackDTOS = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        for (Feedback fee : feedbacks ) {
            feedbackDTOS.add(modelMapper.map(fee, FeedbackDTO.class));
        }
        return feedbackDTOS;
    }

    @Override
    public Boolean deleteByID(Integer id){
        Optional.ofNullable(feedbackRepository.findById(id)).orElseThrow(() ->new EntityNotFoundException());
        feedbackRepository.deleteByID(id);
        return true;
    }

    @Override
    public FeedbackDTO insert(FeedbackDTO feedbackDTO){
        ModelMapper modelMapper = new ModelMapper();
        Feedback feedback = modelMapper.map(feedbackDTO, Feedback.class);
        feedback = feedbackRepository.save(feedback);
        FeedbackDTO dto = modelMapper.map(feedback, FeedbackDTO.class);
        return dto;
    }

}