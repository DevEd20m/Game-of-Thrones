package es.npatarino.android.gotchallenge.domain.datasource.remote;

import java.util.List;

import es.npatarino.android.gotchallenge.domain.Character;
import es.npatarino.android.gotchallenge.domain.House;
import rx.Observable;

public interface CharacterRemoteDataSource {
    Observable<Character> read(Character entity);
    Observable<List<Character>> read(House house);
    Observable<List<Character>> getAll();
}
