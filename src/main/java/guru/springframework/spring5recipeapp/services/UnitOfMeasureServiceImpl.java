package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public Set<UnitOfMeasure> findAll() {
        Set<UnitOfMeasure> unitOfMeasures = new HashSet<>();
        unitOfMeasureRepository.findAll().iterator().forEachRemaining(unitOfMeasures::add);
        return unitOfMeasures;
    }

    @Override
    public UnitOfMeasure findById(Long aLong) {
        return unitOfMeasureRepository.findById(aLong).orElse(null);
    }

    @Override
    public UnitOfMeasure save(UnitOfMeasure object) {
        return unitOfMeasureRepository.save(object);
    }

    @Override
    public void delete(UnitOfMeasure object) {
        unitOfMeasureRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        unitOfMeasureRepository.deleteById(aLong);
    }
}
