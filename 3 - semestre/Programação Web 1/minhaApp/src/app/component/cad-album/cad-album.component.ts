import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Album } from '../../interface/album';
import { AlbumService } from '../../service/album.service';
import { FormsModule } from '@angular/forms';
import { Photo } from '../../interface/photo';
import { PhotoService } from '../../service/photo.service';

@Component({
  selector: 'app-cad-album',
  imports: [CommonModule, FormsModule],
  templateUrl: './cad-album.component.html',
  styleUrl: './cad-album.component.css'
})
export class CadAlbumComponent {

  vetAlbum: Album[] = [];
  album: Album = {
    id: 0,
    userId: 0,
    title: ''
  };
  album2: Album = {
    id: 0,
    userId: 0,
    title: ''
  }

  vetPhoto: Photo[] = [];
  photo: Photo = {
    id: 0,
    albumId: 0,
    title: '',
    url: '',
    thumbnailUrl: ''
  }
  photo2: Photo = {
    id: 0,
    albumId: 0,
    title: '',
    url: '',
    thumbnailUrl: ''
  }
  
  constructor (private albumService: AlbumService, private photoService: PhotoService) {}

  buscaAlbuns(): void {
    this.albumService.findAll().subscribe(
      (pVetAlbum) => this.vetAlbum = pVetAlbum
    );
  }

  buscaAlbum(): void {
    this.albumService.findById(this.album.id!).subscribe(
      //(pAlbum) => this.album = pAlbum
      {
        next: (pAlbum) => this.album = pAlbum,
        error: (pErro) => alert(pErro.status+' - '+pErro.message)
      }
    );
  }

  alteraAlbum(): void {
    this.albumService.updAlbum(this.album).subscribe({
      next: (pAlbum) => this.album2 = pAlbum,
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }

  insereAlbum(): void {
    this.albumService.insAlbum(this.album).subscribe({
      next: (pAlbum) => this.album2 = pAlbum,
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }

  excluiAlbum(): void {
    this.albumService.delAlbum(this.album.id!).subscribe({
      next: () => alert('Álbum '+this.album.id+' excluído com sucesso!'),
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }

  buscaFotos(pAlbumId: number): void {
    this.photoService.findPhotosByAlbum(pAlbumId).subscribe({
      next: (pVetPhoto) => this.vetPhoto = pVetPhoto,
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }

  alteraFoto(): void {
    this.photoService.updPhoto(this.photo).subscribe({
      next: (pPhoto) => this.photo2 = pPhoto,
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }

  excluiFoto(): void {
    this.photoService.delPhoto(this.photo.id!).subscribe({
      next: () => alert('Foto '+this.photo.id+' excluída com sucesso!'),
      error: (pError) => alert(pError.status+' - '+pError.message)
    });
  }
}
