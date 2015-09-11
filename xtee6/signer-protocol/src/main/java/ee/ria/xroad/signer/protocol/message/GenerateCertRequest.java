package ee.ria.xroad.signer.protocol.message;

import java.io.Serializable;

import lombok.Value;

import ee.ria.xroad.common.identifier.ClientId;
import ee.ria.xroad.signer.protocol.dto.KeyUsageInfo;

/**
 * Signer API message.
 */
@Value
public class GenerateCertRequest implements Serializable {

    private final String keyId;

    private final ClientId memberId;

    private final KeyUsageInfo keyUsage;

    private final String subjectName;

}