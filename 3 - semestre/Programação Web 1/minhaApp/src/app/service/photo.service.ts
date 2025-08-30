import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Photo } from '../interface/photo';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(private httpClient: HttpClient) { }

  findPhotosByAlbum(pAlbumId: number): Observable<Photo[]> {
    return this.httpClient.get<Photo[]>('https://jsonplaceholder.typicode.com/albums/'+pAlbumId+'/photos');
  }

  updPhoto(pPhoto: Photo): Observable<Photo> {
    return this.httpClient.put<Photo>('https://jsonplaceholder.typicode.com/photos/'+pPhoto.id, pPhoto);
  }

  delPhoto(pId: number): Observable<void> {
    return this.httpClient.delete<void>('https://jsonplaceholder.typicode.com/photos/'+pId);
  }
}
