package com.example.act13.Repository

import com.example.act13.model.Kontak
import com.example.act13.network.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> =
        kontakApiService.getKontak()


}