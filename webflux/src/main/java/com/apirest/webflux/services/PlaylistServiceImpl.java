package com.apirest.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService {

	@Autowired
	private PlaylistRepository playlistRepository;
	
	@Override
	public Flux<Playlist> findAll() {
		return playlistRepository.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {
		return playlistRepository.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return playlistRepository.save(playlist);
	}
	
}
