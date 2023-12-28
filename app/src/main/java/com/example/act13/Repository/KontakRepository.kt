package com.example.act13.Repository

import com.example.act13.model.Kontak
import com.example.act13.network.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
    suspend fun insertKontak(kontak: Kontak)
    suspend fun updateKontak(id: Int, kontak: Kontak)
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> =
        kontakApiService.getKontak()

    override suspend fun insertKontak(kontak: Kontak) {
        kontakApiService.insertKontak(kontak)
    }

    override suspend fun updateKontak(id: Int, kontak: Kontak) {
        kontakApiService.updateKontak(id, kontak)
    }
}