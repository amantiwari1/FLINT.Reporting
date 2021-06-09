/*
 * Copyright (C) 2021 Moja Global
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package global.moja.dataprocessor.models;

import lombok.*;

/**
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 * @since 0.0.1
 */

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Data
@Builder
public class Location implements Comparable<Location> {

    private Long id;
    private Long partyId;
    private Long tileId;
    private Long vegetationHistoryId;
    private Long unitCount;
    private Double unitAreaSum;

    @Override
    public int compareTo(Location location) {

        if (this.id != null && location.getId() != null) {
            return this.id.compareTo(location.getId());
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return
                String.format(
                        "Id: %d, " +
                        "Party Id: %d, " +
                        "Tile Id: %d, " +
                        "Vegetation History Id: %d, " +
                        "Unit Count: %d, " +
                        "Unit Area Sum: %f",
                        id, partyId, tileId, vegetationHistoryId, unitCount, unitAreaSum);
    }

}
