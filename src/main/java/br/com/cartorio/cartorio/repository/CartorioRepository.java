package br.com.cartorio.cartorio.repository;

import br.com.cartorio.cartorio.domain.Cartorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Long> {

}
